import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class biw extends bil implements bij, bjx {
   private static final Logger b = LogUtils.getLogger();
   private static final aec<Float> c = aef.a(biw.class, aee.d);
   private static final aec<Float> d = aef.a(biw.class, aee.d);
   private static final aec<Boolean> e = aef.a(biw.class, aee.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private biw.a k;
   @Nullable
   private biw.a l;

   public biw(bip<?> $$0, cpq $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   protected void a_() {
      this.an.a(c, 1.0F);
      this.an.a(d, 1.0F);
      this.an.a(e, false);
   }

   @Override
   protected void a(qu $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         biw.a.a.decode(rf.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (biw.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         biw.a.a.decode(rf.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (biw.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.ao());
   }

   @Override
   protected void b(qu $$0) {
      $$0.a("width", this.m());
      $$0.a("height", this.o());
      if (this.k != null) {
         biw.a.a.encodeStart(rf.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         biw.a.a.encodeStart(rf.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.p());
   }

   @Override
   public void a(aec<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.ao());
      }
   }

   @Override
   public boolean bq() {
      return false;
   }

   @Override
   public boolean br() {
      return true;
   }

   @Override
   public eam l_() {
      return eam.d;
   }

   @Override
   public boolean d_() {
      return true;
   }

   @Override
   public boolean u(bil $$0) {
      if ($$0 instanceof cbp $$1) {
         this.k = new biw.a($$1.cv(), this.dK().V());
         if ($$1 instanceof ako $$2) {
            al.g.a($$2, this, $$1.dL().n(), 1.0F, 1.0F, false);
         }

         return !this.p();
      } else {
         return false;
      }
   }

   @Override
   public bgt a(cbp $$0, bgs $$1) {
      if (this.dK().B) {
         return this.p() ? bgt.a : bgt.b;
      } else {
         this.l = new biw.a($$0.cv(), this.dK().V());
         return bgt.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bjb M_() {
      return this.k != null ? this.dK().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bjb j() {
      return this.l != null ? this.dK().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.an.b(c, $$0);
   }

   private float m() {
      return this.an.b(c);
   }

   private void b(float $$0) {
      this.an.b(d, $$0);
   }

   private float o() {
      return this.an.b(d);
   }

   private void a(boolean $$0) {
      this.an.b(e, $$0);
   }

   private boolean p() {
      return this.an.b(e);
   }

   private bim q() {
      return bim.b(this.m(), this.o());
   }

   @Override
   public bim a(bjn $$0) {
      return this.q();
   }

   @Override
   protected ehd ao() {
      return this.q().a(this.di());
   }

   static record a(UUID b, long c) {
      public static final Codec<biw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ia.a.fieldOf("player").forGetter(biw.a::a), Codec.LONG.fieldOf("timestamp").forGetter(biw.a::b)).apply($$0, biw.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
