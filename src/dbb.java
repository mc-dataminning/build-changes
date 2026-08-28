import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbb implements daz {
   final Optional<dad> a;
   final Optional<dad> b;
   final Optional<dad> c;
   final cvp d;
   @Nullable
   private dag e;

   public dbb(Optional<dad> $$0, Optional<dad> $$1, Optional<dad> $$2, cvp $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public cvp a(dba $$0, jp.a $$1) {
      cvp $$2 = $$0.d().a(this.d.h(), this.d.J());
      $$2.b(this.d.e());
      return $$2;
   }

   @Override
   public cvp a(jp.a $$0) {
      return this.d;
   }

   @Override
   public boolean a(cvp $$0) {
      return dad.a(this.a, $$0);
   }

   @Override
   public boolean b(cvp $$0) {
      return dad.a(this.b, $$0);
   }

   @Override
   public boolean c(cvp $$0) {
      return dad.a(this.c, $$0);
   }

   @Override
   public dam<?> aq_() {
      return dam.t;
   }

   @Override
   public dag a() {
      if (this.e == null) {
         this.e = dag.a(List.of(this.a, this.b, this.c));
      }

      return this.e;
   }

   public static class a implements dam<dbb> {
      private static final MapCodec<dbb> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dad.d.optionalFieldOf("template").forGetter($$0x -> $$0x.a),
                  dad.d.optionalFieldOf("base").forGetter($$0x -> $$0x.b),
                  dad.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.c),
                  cvp.d.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, dbb::new)
      );
      public static final zb<wo, dbb> w = zb.a(dad.b, $$0 -> $$0.a, dad.b, $$0 -> $$0.b, dad.b, $$0 -> $$0.c, cvp.i, $$0 -> $$0.d, dbb::new);

      @Override
      public MapCodec<dbb> a() {
         return x;
      }

      @Override
      public zb<wo, dbb> b() {
         return w;
      }
   }
}
