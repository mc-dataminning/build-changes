import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dls extends dem {
   public static final MapCodec<dls> a = b(dls::new);
   public static final dsu b = dst.E;
   private final bqa c = bpx.a(5);

   @Override
   public MapCodec<dls> a() {
      return a;
   }

   public dls(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return $$0.B ? null : a($$2, dpk.K, dqo::a);
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, cuq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
