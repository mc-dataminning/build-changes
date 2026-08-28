import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class btl extends bsv implements bss, buo {
   private static final Logger b = LogUtils.getLogger();
   private static final akk<Float> c = ako.a(btl.class, akm.d);
   private static final akk<Float> d = ako.a(btl.class, akm.d);
   private static final akk<Boolean> e = ako.a(btl.class, akm.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private btl.a k;
   @Nullable
   private btl.a l;

   public btl(btb<?> $$0, dbz $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(c, 1.0F);
      $$0.a(d, 1.0F);
      $$0.a(e, false);
   }

   @Override
   protected void a(us $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         btl.a.a.decode(vg.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (btl.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         btl.a.a.decode(vg.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (btl.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.as());
   }

   @Override
   protected void b(us $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.u());
      if (this.k != null) {
         btl.a.a.encodeStart(vg.a, this.k).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         btl.a.a.encodeStart(vg.a, this.l).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(akk<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.as());
      }
   }

   @Override
   public boolean by() {
      return false;
   }

   @Override
   public boolean bz() {
      return true;
   }

   @Override
   public eob k_() {
      return eob.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(bsv $$0) {
      if ($$0 instanceof cmy $$1) {
         this.k = new btl.a($$1.cz(), this.dP().Z());
         if ($$1 instanceof arg $$2) {
            am.h.a($$2, this, $$1.dQ().n(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public bqv a(cmy $$0, bqu $$1) {
      if (this.dP().B) {
         return this.v() ? bqv.a : bqv.c;
      } else {
         this.l = new btl.a($$0.cz(), this.dP().Z());
         return bqv.c;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public btq T_() {
      return this.k != null ? this.dP().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public btq p() {
      return this.l != null ? this.dP().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.ao.a(c, $$0);
   }

   private float s() {
      return this.ao.a(c);
   }

   private void b(float $$0) {
      this.ao.a(d, $$0);
   }

   private float u() {
      return this.ao.a(d);
   }

   private void a(boolean $$0) {
      this.ao.a(e, $$0);
   }

   private boolean v() {
      return this.ao.a(e);
   }

   private bsy w() {
      return bsy.b(this.s(), this.u());
   }

   @Override
   public bsy a(buc $$0) {
      return this.w();
   }

   @Override
   protected evn as() {
      return this.w().a(this.dn());
   }

   static record a(UUID b, long c) {
      public static final Codec<btl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kc.a.fieldOf("player").forGetter(btl.a::a), Codec.LONG.fieldOf("timestamp").forGetter(btl.a::b)).apply($$0, btl.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
