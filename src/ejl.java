import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejl extends ejo {
   public static final MapCodec<ejl> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bro.b(4, 16).fieldOf("height").forGetter($$0x -> $$0x.b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("wide_bottom_layer_hole_chance").forGetter($$0x -> $$0x.c),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("corner_hole_chance").forGetter($$0x -> $$0x.c),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("hanging_leaves_chance").forGetter($$0x -> $$0x.h),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("hanging_leaves_extension_chance").forGetter($$0x -> $$0x.i)
               )
            )
            .apply($$0, ejl::new)
   );
   private final bro b;
   private final float c;
   private final float g;
   private final float h;
   private final float i;

   public ejl(bro $$0, bro $$1, bro $$2, float $$3, float $$4, float $$5, float $$6) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
   }

   @Override
   protected ejp<?> a() {
      return ejp.k;
   }

   @Override
   protected void a(dgo $$0, ejo.b $$1, azh $$2, eiy $$3, int $$4, ejo.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      ji $$10 = $$5.a().b($$8);
      int $$11 = $$7 + $$5.b() - 1;
      this.a($$0, $$1, $$2, $$3, $$10, $$11 - 2, $$6 - 3, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$11 - 1, $$6 - 4, $$9);

      for (int $$12 = $$6 - 5; $$12 >= 0; $$12--) {
         this.a($$0, $$1, $$2, $$3, $$10, $$11, $$12, $$9);
      }

      this.a($$0, $$1, $$2, $$3, $$10, $$11, -1, $$9, this.h, this.i);
      this.a($$0, $$1, $$2, $$3, $$10, $$11 - 1, -2, $$9, this.h, this.i);
   }

   @Override
   public int a(azh $$0, int $$1, eiy $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(azh $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      if ($$2 == -1 && ($$1 == $$4 || $$3 == $$4) && $$0.i() < this.c) {
         return true;
      } else {
         boolean $$6 = $$1 == $$4 && $$3 == $$4;
         boolean $$7 = $$4 > 2;
         return $$7 ? $$6 || $$1 + $$3 > $$4 * 2 - 2 && $$0.i() < this.g : $$6 && $$0.i() < this.g;
      }
   }
}
