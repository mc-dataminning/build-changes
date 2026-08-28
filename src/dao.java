import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dao implements dal {
   final Optional<czp> a;
   final Optional<czp> b;
   final Optional<czp> c;
   @Nullable
   private czs d;

   public dao(Optional<czp> $$0, Optional<czp> $$1, Optional<czp> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cvl a(dam $$0, jp.a $$1) {
      cvl $$2 = $$0.d();
      if (czp.a(this.b, $$2)) {
         Optional<jn.c<cxr>> $$3 = cxs.a($$1, $$0.e());
         Optional<jn.c<cxt>> $$4 = cxu.a($$1, $$0.c());
         if ($$3.isPresent() && $$4.isPresent()) {
            cxq $$5 = $$2.a(kr.M);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cvl.k;
            }

            cvl $$6 = $$2.c(1);
            $$6.b(kr.M, new cxq($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cvl.k;
   }

   @Override
   public cvl a(jp.a $$0) {
      cvl $$1 = new cvl(cvo.pI);
      Optional<jn.c<cxt>> $$2 = $$0.b(lv.aX).b().findFirst();
      Optional<jn.c<cxr>> $$3 = $$0.b(lv.aW).a(cxs.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(kr.M, new cxq($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(cvl $$0) {
      return czp.a(this.a, $$0);
   }

   @Override
   public boolean b(cvl $$0) {
      return czp.a(this.b, $$0);
   }

   @Override
   public boolean c(cvl $$0) {
      return czp.a(this.c, $$0);
   }

   @Override
   public czy<?> as_() {
      return czy.u;
   }

   @Override
   public czs a() {
      if (this.d == null) {
         this.d = czs.a(List.of(this.a, this.b, this.c));
      }

      return this.d;
   }

   public static class a implements czy<dao> {
      private static final MapCodec<dao> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  czp.d.optionalFieldOf("template").forGetter($$0x -> $$0x.a),
                  czp.d.optionalFieldOf("base").forGetter($$0x -> $$0x.b),
                  czp.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, dao::new)
      );
      public static final zb<wo, dao> w = zb.a(czp.b, $$0 -> $$0.a, czp.b, $$0 -> $$0.b, czp.b, $$0 -> $$0.c, dao::new);

      @Override
      public MapCodec<dao> a() {
         return x;
      }

      @Override
      public zb<wo, dao> b() {
         return w;
      }
   }
}
