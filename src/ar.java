import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ar {
   public static final Codec<ar> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cur.d.fieldOf("icon").forGetter(ar::c),
               xr.a.fieldOf("title").forGetter(ar::a),
               xr.a.fieldOf("description").forGetter(ar::b),
               alf.a.optionalFieldOf("background").forGetter(ar::d),
               al.d.optionalFieldOf("frame", al.a).forGetter(ar::e),
               Codec.BOOL.optionalFieldOf("show_toast", true).forGetter(ar::h),
               Codec.BOOL.optionalFieldOf("announce_to_chat", true).forGetter(ar::i),
               Codec.BOOL.optionalFieldOf("hidden", false).forGetter(ar::j)
            )
            .apply($$0, ar::new)
   );
   public static final zn<xa, ar> b = zn.a(ar::a, ar::b);
   private final xp c;
   private final xp d;
   private final cur e;
   private final Optional<alf> f;
   private final al g;
   private final boolean h;
   private final boolean i;
   private final boolean j;
   private float k;
   private float l;

   public ar(cur $$0, xp $$1, xp $$2, Optional<alf> $$3, al $$4, boolean $$5, boolean $$6, boolean $$7) {
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

   public xp a() {
      return this.c;
   }

   public xp b() {
      return this.d;
   }

   public cur c() {
      return this.e;
   }

   public Optional<alf> d() {
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

   private void a(xa $$0) {
      xr.d.encode($$0, this.c);
      xr.d.encode($$0, this.d);
      cur.i.encode($$0, this.e);
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

   private static ar b(xa $$0) {
      xp $$1 = xr.d.decode($$0);
      xp $$2 = xr.d.decode($$0);
      cur $$3 = cur.i.decode($$0);
      al $$4 = $$0.b(al.class);
      int $$5 = $$0.readInt();
      Optional<alf> $$6 = ($$5 & 1) != 0 ? Optional.of($$0.q()) : Optional.empty();
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      ar $$9 = new ar($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }
}
