import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddg extends cwb {
   public static final MapCodec<ddg> a = b(ddg::new);
   public static final djx b = djw.E;
   private final bjf c = bjc.a(5);

   @Override
   public MapCodec<ddg> a() {
      return a;
   }

   public ddg(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dhz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return $$0.B ? null : a($$2, dgw.K, dhz::a);
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, cmx $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
