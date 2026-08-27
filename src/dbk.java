import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbk extends cwp implements ddp {
   public static final MapCodec<dbk> a = b(dbk::new);
   public static final djx b = djw.C;

   @Override
   public MapCodec<dbk> a() {
      return a;
   }

   protected dbk(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(djg $$0, djg $$1, ic $$2) {
      return $$1.a(cwr.ac) && $$2.o() == ic.a.b;
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      eeq $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eer.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(b) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }
}
