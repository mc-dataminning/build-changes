import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ffb(alr b, fc.g c) implements fey {
   public static final MapCodec<ffb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alr.a.fieldOf("storage").forGetter(ffb::c), fc.g.a.fieldOf("path").forGetter(ffb::d)).apply($$0, ffb::new)
   );

   @Override
   public fex b() {
      return fez.f;
   }

   private Number a(fat $$0, Number $$1) {
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
   public float b(fat $$0) {
      return this.a($$0, 0.0F).floatValue();
   }

   @Override
   public int a(fat $$0) {
      return this.a($$0, 0).intValue();
   }

   public alr c() {
      return this.b;
   }

   public fc.g d() {
      return this.c;
   }
}
