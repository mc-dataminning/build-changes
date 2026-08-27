import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvw extends cwp implements ddp {
   public static final MapCodec<cvw> a = b(cvw::new);
   public static final djx b = djw.C;

   @Override
   public MapCodec<cvw> a() {
      return a;
   }

   protected cvw(djf.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean a_(djg $$0, csu $$1, hx $$2) {
      return true;
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.a;
   }

   @Override
   public float d(djg $$0, csu $$1, hx $$2) {
      return 1.0F;
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

   @Nullable
   @Override
   public djg a(cpg $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eer.c));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }

   @Override
   public cmx a(@Nullable cfh $$0, ctp $$1, hx $$2, djg $$3) {
      return $$0 != null && $$0.f() ? ddp.super.a($$0, $$1, $$2, $$3) : cmx.f;
   }

   @Override
   public boolean a(@Nullable cfh $$0, csu $$1, hx $$2, djg $$3, eep $$4) {
      return $$0 != null && $$0.f() ? ddp.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
