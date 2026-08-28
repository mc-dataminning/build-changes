import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmx extends dfa {
   public static final MapCodec<dmx> a = b(dmx::new);
   private static final xp d = xp.c("container.stonecutter");
   public static final dsx b = diw.aE;
   protected static final ewl c = dfa.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dmx> a() {
      return a;
   }

   public dmx(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   public dsd a(cyb $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.B) {
         return bqv.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awk.ay);
         return bqv.c;
      }
   }

   @Nullable
   @Override
   protected bqz b(dsd $$0, dbz $$1, iz $$2) {
      return new brf(($$2x, $$3, $$4) -> new crw($$2x, $$3, cqg.a($$1, $$2)), d);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return c;
   }

   @Override
   protected boolean f_(dsd $$0) {
      return true;
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
