import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class bce extends DataFix {
   private static final int[][] a = new int[][]{{0, 0, 1}, {-1, 0, 0}, {0, 0, -1}, {1, 0, 0}};

   public bce(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   private Dynamic<?> a(Dynamic<?> $$0, boolean $$1, boolean $$2) {
      if (($$1 || $$2) && $$0.get("Facing").asNumber().result().isEmpty()) {
         int $$3;
         if ($$0.get("Direction").asNumber().result().isPresent()) {
            $$3 = $$0.get("Direction").asByte((byte)0) % a.length;
            int[] $$4 = a[$$3];
            $$0 = $$0.set("TileX", $$0.createInt($$0.get("TileX").asInt(0) + $$4[0]));
            $$0 = $$0.set("TileY", $$0.createInt($$0.get("TileY").asInt(0) + $$4[1]));
            $$0 = $$0.set("TileZ", $$0.createInt($$0.get("TileZ").asInt(0) + $$4[2]));
            $$0 = $$0.remove("Direction");
            if ($$2 && $$0.get("ItemRotation").asNumber().result().isPresent()) {
               $$0 = $$0.set("ItemRotation", $$0.createByte((byte)($$0.get("ItemRotation").asByte((byte)0) * 2)));
            }
         } else {
            $$3 = $$0.get("Dir").asByte((byte)0) % a.length;
            $$0 = $$0.remove("Dir");
         }

         $$0 = $$0.set("Facing", $$0.createByte((byte)$$3));
      }

      return $$0;
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getChoiceType(bfs.z, "Painting");
      OpticFinder<?> $$1 = DSL.namedChoice("Painting", $$0);
      Type<?> $$2 = this.getInputSchema().getChoiceType(bfs.z, "ItemFrame");
      OpticFinder<?> $$3 = DSL.namedChoice("ItemFrame", $$2);
      Type<?> $$4 = this.getInputSchema().getType(bfs.z);
      TypeRewriteRule $$5 = this.fixTypeEverywhereTyped(
         "EntityPaintingFix", $$4, $$2x -> $$2x.updateTyped($$1, $$0, $$0xx -> $$0xx.update(DSL.remainderFinder(), $$0xxx -> this.a($$0xxx, true, false)))
      );
      TypeRewriteRule $$6 = this.fixTypeEverywhereTyped(
         "EntityItemFrameFix", $$4, $$2x -> $$2x.updateTyped($$3, $$2, $$0xx -> $$0xx.update(DSL.remainderFinder(), $$0xxx -> this.a($$0xxx, false, true)))
      );
      return TypeRewriteRule.seq($$5, $$6);
   }
}
