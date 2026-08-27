import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dbp extends daa {
   public static final MapCodec<daa> a = ki.e.q().fieldOf("dead");
   public static final MapCodec<dbp> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, dbp::new));
   private final daa c;

   public dbp(daa $$0, dmy.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dbp> a() {
      return b;
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.E_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(cwf $$0, ib $$1) {
      for (ih $$2 : ih.values()) {
         ein $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(aus.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.o();
   }
}
