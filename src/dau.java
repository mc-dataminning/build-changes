import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dau extends czf {
   public static final MapCodec<czf> a = kh.e.q().fieldOf("dead");
   public static final MapCodec<dau> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, dau::new));
   private final czf c;

   public dau(czf $$0, dmd.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dau> a() {
      return b;
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.F_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(cvk $$0, ib $$1) {
      for (ih $$2 : ih.values()) {
         ehr $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(auj.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().F_().a(40));
      }

      return this.o();
   }
}
