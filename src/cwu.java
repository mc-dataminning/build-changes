import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cwu extends cvf {
   public static final MapCodec<cvf> a = kc.f.q().fieldOf("dead");
   public static final MapCodec<cwu> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, cwu::new));
   private final cvf c;

   public cwu(cvf $$0, dhm.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<cwu> a() {
      return b;
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.F_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(crl $$0, hx $$1) {
      for (ib $$2 : ib.values()) {
         ecx $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(arp.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().F_().a(40));
      }

      return this.o();
   }
}
