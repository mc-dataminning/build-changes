import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbc implements daz {
   final Optional<dad> a;
   final Optional<dad> b;
   final Optional<dad> c;
   @Nullable
   private dag d;

   public dbc(Optional<dad> $$0, Optional<dad> $$1, Optional<dad> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cvp a(dba $$0, jp.a $$1) {
      cvp $$2 = $$0.d();
      if (dad.a(this.b, $$2)) {
         Optional<jn.c<cxs>> $$3 = cxt.a($$1, $$0.e());
         Optional<jn.c<cxu>> $$4 = cxv.a($$1, $$0.c());
         if ($$3.isPresent() && $$4.isPresent()) {
            cxr $$5 = $$2.a(kr.P);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cvp.k;
            }

            cvp $$6 = $$2.c(1);
            $$6.b(kr.P, new cxr($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cvp.k;
   }

   @Override
   public cvp a(jp.a $$0) {
      cvp $$1 = new cvp(cvt.pI);
      Optional<jn.c<cxu>> $$2 = $$0.b(lv.aY).b().findFirst();
      Optional<jn.c<cxs>> $$3 = $$0.b(lv.aX).a(cxt.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(kr.P, new cxr($$3.get(), $$2.get()));
      }

      return $$1;
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
      return dam.u;
   }

   @Override
   public dag a() {
      if (this.d == null) {
         this.d = dag.a(List.of(this.a, this.b, this.c));
      }

      return this.d;
   }

   public static class a implements dam<dbc> {
      private static final MapCodec<dbc> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dad.d.optionalFieldOf("template").forGetter($$0x -> $$0x.a),
                  dad.d.optionalFieldOf("base").forGetter($$0x -> $$0x.b),
                  dad.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, dbc::new)
      );
      public static final zb<wo, dbc> w = zb.a(dad.b, $$0 -> $$0.a, dad.b, $$0 -> $$0.b, dad.b, $$0 -> $$0.c, dbc::new);

      @Override
      public MapCodec<dbc> a() {
         return x;
      }

      @Override
      public zb<wo, dbc> b() {
         return w;
      }
   }
}
