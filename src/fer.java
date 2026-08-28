import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record fer(alk b, fc.g c) implements feo {
   public static final MapCodec<fer> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alk.a.fieldOf("storage").forGetter(fer::c), fc.g.a.fieldOf("path").forGetter(fer::d)).apply($$0, fer::new)
   );

   @Override
   public fen b() {
      return fep.f;
   }

   private Number a(faj $$0, Number $$1) {
      ua $$2 = $$0.d().p().aK().a(this.b);

      try {
         List<va> $$3 = this.c.a($$2);
         if ($$3.size() == 1 && $$3.getFirst() instanceof uq $$4) {
            return $$4.m();
         }
      } catch (CommandSyntaxException var7) {
      }

      return $$1;
   }

   @Override
   public float b(faj $$0) {
      return this.a($$0, 0.0F).floatValue();
   }

   @Override
   public int a(faj $$0) {
      return this.a($$0, 0).intValue();
   }

   public alk c() {
      return this.b;
   }

   public fc.g d() {
      return this.c;
   }
}
