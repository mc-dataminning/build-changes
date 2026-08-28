import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ar {
   public static final Codec<ar> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cun.d.fieldOf("icon").forGetter(ar::c),
               xq.a.fieldOf("title").forGetter(ar::a),
               xq.a.fieldOf("description").forGetter(ar::b),
               ale.a.optionalFieldOf("background").forGetter(ar::d),
               al.d.optionalFieldOf("frame", al.a).forGetter(ar::e),
               Codec.BOOL.optionalFieldOf("show_toast", true).forGetter(ar::h),
               Codec.BOOL.optionalFieldOf("announce_to_chat", true).forGetter(ar::i),
               Codec.BOOL.optionalFieldOf("hidden", false).forGetter(ar::j)
            )
            .apply($$0, ar::new)
   );
   public static final zm<wz, ar> b = zm.a(ar::a, ar::b);
   private final xo c;
   private final xo d;
   private final cun e;
   private final Optional<ale> f;
   private final al g;
   private final boolean h;
   private final boolean i;
   private final boolean j;
   private float k;
   private float l;

   public ar(cun $$0, xo $$1, xo $$2, Optional<ale> $$3, al $$4, boolean $$5, boolean $$6, boolean $$7) {
      this.c = $$1;
      this.d = $$2;
      this.e = $$0;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.j = $$7;
   }

   public void a(float $$0, float $$1) {
      this.k = $$0;
      this.l = $$1;
   }

   public xo a() {
      return this.c;
   }

   public xo b() {
      return this.d;
   }

   public cun c() {
      return this.e;
   }

   public Optional<ale> d() {
      return this.f;
   }

   public al e() {
      return this.g;
   }

   public float f() {
      return this.k;
   }

   public float g() {
      return this.l;
   }

   public boolean h() {
      return this.h;
   }

   public boolean i() {
      return this.i;
   }

   public boolean j() {
      return this.j;
   }

   private void a(wz $$0) {
      xq.d.encode($$0, this.c);
      xq.d.encode($$0, this.d);
      cun.i.encode($$0, this.e);
      $$0.a(this.g);
      int $$1 = 0;
      if (this.f.isPresent()) {
         $$1 |= 1;
      }

      if (this.h) {
         $$1 |= 2;
      }

      if (this.j) {
         $$1 |= 4;
      }

      $$0.p($$1);
      this.f.ifPresent($$0::a);
      $$0.a(this.k);
      $$0.a(this.l);
   }

   private static ar b(wz $$0) {
      xo $$1 = xq.d.decode($$0);
      xo $$2 = xq.d.decode($$0);
      cun $$3 = cun.i.decode($$0);
      al $$4 = $$0.b(al.class);
      int $$5 = $$0.readInt();
      Optional<ale> $$6 = ($$5 & 1) != 0 ? Optional.of($$0.q()) : Optional.empty();
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      ar $$9 = new ar($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }
}
