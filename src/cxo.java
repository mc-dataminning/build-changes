import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cxo extends cvz {
   public static final MapCodec<cvz> a = kb.e.q().fieldOf("dead");
   public static final MapCodec<cxo> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, cxo::new));
   private final cvz c;

   public cxo(cvz $$0, dio.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<cxo> a() {
      return b;
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.F_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(cse $$0, hv $$1) {
      for (ia $$2 : ia.values()) {
         edz $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(arw.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().F_().a(40));
      }

      return this.o();
   }
}
