import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dem extends dff implements dmg {
   public static final MapCodec<dem> a = b(dem::new);
   public static final dsy b = dsx.C;

   @Override
   public MapCodec<dem> a() {
      return a;
   }

   protected dem(dsg.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(dsh $$0, dbj $$1, ja $$2) {
      return $$0.u().c();
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.a;
   }

   @Override
   protected float d(dsh $$0, dbj $$1, ja $$2) {
      return 1.0F;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(b) ? eoc.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eoc.c));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }

   @Override
   public cua a(@Nullable cmh $$0, dce $$1, ja $$2, dsh $$3) {
      return $$0 != null && $$0.f() ? dmg.super.a($$0, $$1, $$2, $$3) : cua.l;
   }

   @Override
   public boolean a(@Nullable cmh $$0, dbj $$1, ja $$2, dsh $$3, eoa $$4) {
      return $$0 != null && $$0.f() ? dmg.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
