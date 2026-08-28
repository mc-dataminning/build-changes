import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dhn extends dfy {
   public static final MapCodec<dfy> a = lt.e.r().fieldOf("dead");
   public static final MapCodec<dhn> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, dhn::new));
   private final dfy c;

   public dhn(dfy $$0, dtb.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dhn> a() {
      return b;
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.E_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(dcc $$0, jd $$1) {
      for (ji $$2 : ji.values()) {
         epe $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(awk.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.o();
   }
}
