import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dau extends cvz implements dcz {
   public static final MapCodec<dau> a = b(dau::new);
   public static final djg b = djf.C;

   @Override
   public MapCodec<dau> a() {
      return a;
   }

   protected dau(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(dip $$0, dip $$1, ia $$2) {
      return $$1.a(cwb.ac) && $$2.o() == ia.a.b;
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      edz $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eea.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(b) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }
}
