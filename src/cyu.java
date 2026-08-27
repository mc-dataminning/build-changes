import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyu extends cua implements daz {
   public static final MapCodec<cyu> a = b(cyu::new);
   public static final dgs b = dgr.C;

   @Override
   public MapCodec<cyu> a() {
      return a;
   }

   protected cyu(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(dgb $$0, dgb $$1, hx $$2) {
      return $$1.a(cuc.ac) && $$2.o() == hx.a.b;
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      ebe $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ebf.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(b) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }
}
