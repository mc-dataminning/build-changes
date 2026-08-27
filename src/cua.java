import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cua extends cut implements dbt {
   public static final MapCodec<cua> a = b(cua::new);
   public static final dhn b = dhm.C;

   @Override
   public MapCodec<cua> a() {
      return a;
   }

   protected cua(dgv.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean c(dgw $$0, cqy $$1, ht $$2) {
      return true;
   }

   @Override
   public day b_(dgw $$0) {
      return day.a;
   }

   @Override
   public float b(dgw $$0, cqy $$1, ht $$2) {
      return 1.0F;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(b) ? ech.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == ech.c));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }

   @Override
   public clb a(@Nullable cdm $$0, crt $$1, ht $$2, dgw $$3) {
      return $$0 != null && $$0.f() ? dbt.super.a($$0, $$1, $$2, $$3) : clb.b;
   }

   @Override
   public boolean a(@Nullable cdm $$0, cqy $$1, ht $$2, dgw $$3, ecf $$4) {
      return $$0 != null && $$0.f() ? dbt.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
