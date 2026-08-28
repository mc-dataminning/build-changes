import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doc extends dgv {
   public static final MapCodec<doc> a = b(doc::new);
   public static final dvf b = dve.E;
   private final bqu c = bqr.a(5);

   @Override
   public MapCodec<doc> a() {
      return a;
   }

   public doc(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public drs a(je $$0, duo $$1) {
      return new dta($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return $$0.B ? null : a($$2, dru.K, dta::a);
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, cvp $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
