import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record fep(ali b, fb.g c) implements fem {
   public static final MapCodec<fep> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ali.a.fieldOf("storage").forGetter(fep::c), fb.g.a.fieldOf("path").forGetter(fep::d)).apply($$0, fep::new)
   );

   @Override
   public fel b() {
      return fen.f;
   }

   private Number a(fah $$0, Number $$1) {
      tz $$2 = $$0.d().p().aK().a(this.b);

      try {
         List<uy> $$3 = this.c.a($$2);
         if ($$3.size() == 1 && $$3.getFirst() instanceof up $$4) {
            return $$4.m();
         }
      } catch (CommandSyntaxException var7) {
      }

      return $$1;
   }

   @Override
   public float b(fah $$0) {
      return this.a($$0, 0.0F).floatValue();
   }

   @Override
   public int a(fah $$0) {
      return this.a($$0, 0).intValue();
   }

   public ali c() {
      return this.b;
   }

   public fb.g d() {
      return this.c;
   }
}
