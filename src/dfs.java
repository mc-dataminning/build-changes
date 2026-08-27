import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfs extends dfb implements ddq {
   public static final MapCodec<dfs> a = b(dfs::new);
   public static final djy c = djx.C;

   @Override
   protected MapCodec<? extends dfs> a() {
      return a;
   }

   protected dfs(djg.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      eer $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(ees.c)));
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(c) ? ees.c.a(true) : super.c_($$0);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c);
   }
}
