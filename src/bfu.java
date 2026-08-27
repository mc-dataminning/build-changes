import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bfu extends bfj implements bfh, bgw {
   private static final Logger b = LogUtils.getLogger();
   private static final aby<Float> c = acb.a(bfu.class, aca.d);
   private static final aby<Float> d = acb.a(bfu.class, aca.d);
   private static final aby<Boolean> e = acb.a(bfu.class, aca.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bfu.a k;
   @Nullable
   private bfu.a l;

   public bfu(bfn<?> $$0, cmm $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   protected void a_() {
      this.am.a(c, 1.0F);
      this.am.a(d, 1.0F);
      this.am.a(e, false);
   }

   @Override
   protected void a(qr $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.s($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bfu.a.a.decode(rc.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bfu.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bfu.a.a.decode(rc.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bfu.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.am());
   }

   @Override
   protected void b(qr $$0) {
      $$0.a("width", this.k());
      $$0.a("height", this.o());
      if (this.k != null) {
         bfu.a.a.encodeStart(rc.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bfu.a.a.encodeStart(rc.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.p());
   }

   @Override
   public void a(aby<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.am());
      }
   }

   @Override
   public boolean bn() {
      return false;
   }

   @Override
   public boolean bo() {
      return true;
   }

   @Override
   public dxj l_() {
      return dxj.d;
   }

   @Override
   public boolean c_() {
      return true;
   }

   @Override
   public boolean r(bfj $$0) {
      if ($$0 instanceof byo $$1) {
         this.k = new bfu.a($$1.ct(), this.dI().V());
         if ($$1 instanceof aig $$2) {
            ai.g.a($$2, this, $$1.dJ().n(), 1.0F, 1.0F, false);
         }

         return !this.p();
      } else {
         return false;
      }
   }

   @Override
   public bdx a(byo $$0, bdw $$1) {
      if (this.dI().B) {
         return this.p() ? bdx.a : bdx.b;
      } else {
         this.l = new bfu.a($$0.ct(), this.dI().V());
         return bdx.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bfz M_() {
      return this.k != null ? this.dI().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bfz j() {
      return this.l != null ? this.dI().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.am.b(c, $$0);
   }

   private float k() {
      return this.am.b(c);
   }

   private void s(float $$0) {
      this.am.b(d, $$0);
   }

   private float o() {
      return this.am.b(d);
   }

   private void a(boolean $$0) {
      this.am.b(e, $$0);
   }

   private boolean p() {
      return this.am.b(e);
   }

   private bfk q() {
      return bfk.b(this.k(), this.o());
   }

   @Override
   public bfk a(bgl $$0) {
      return this.q();
   }

   @Override
   protected eed am() {
      return this.q().a(this.dg());
   }

   static record a(UUID b, long c) {
      public static final Codec<bfu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(hy.a.fieldOf("player").forGetter(bfu.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bfu.a::b)).apply($$0, bfu.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
