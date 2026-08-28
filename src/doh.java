import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class doh extends dmr {
   public static final MapCodec<dmr> a = mg.e.q().fieldOf("dead");
   public static final MapCodec<doh> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, doh::new));
   private final dmr c;

   public doh(dmr $$0, eas.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<doh> a() {
      return b;
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if (!this.a($$1, $$3)) {
         $$2.a($$3, this, 60 + $$7.a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected boolean a(diq $$0, iv $$1) {
      for (jb $$2 : jb.values()) {
         exa $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(axh.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().C_().a(40));
      }

      return this.m();
   }
}
