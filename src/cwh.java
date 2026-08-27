import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cwh extends cut {
   public static final MapCodec<cut> a = jy.f.q().fieldOf("dead");
   public static final MapCodec<cwh> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, cwh::new));
   private final cut c;

   public cwh(cut $$0, dgv.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<cwh> a() {
      return b;
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.E_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(cqy $$0, ht $$1) {
      for (hx $$2 : hx.values()) {
         ecg $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(arh.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.o();
   }
}
