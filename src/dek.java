import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dek extends dcv {
   public static final MapCodec<dcv> a = lc.e.q().fieldOf("dead");
   public static final MapCodec<dek> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, dek::new));
   private final dcv c;

   public dek(dcv $$0, dpx.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dek> a() {
      return b;
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.n(), 2);
      }
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.E_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(cza $$0, im $$1) {
      for (ir $$2 : ir.values()) {
         elr $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(avt.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.n();
   }
}
