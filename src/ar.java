import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ar {
   public static final Codec<ar> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cqk.b.fieldOf("icon").forGetter(ar::c),
               vw.a.fieldOf("title").forGetter(ar::a),
               vw.a.fieldOf("description").forGetter(ar::b),
               awe.a(ajh.a, "background").forGetter(ar::d),
               awe.a(al.d, "frame", al.a).forGetter(ar::e),
               awe.a(Codec.BOOL, "show_toast", true).forGetter(ar::h),
               awe.a(Codec.BOOL, "announce_to_chat", true).forGetter(ar::i),
               awe.a(Codec.BOOL, "hidden", false).forGetter(ar::j)
            )
            .apply($$0, ar::new)
   );
   public static final xs<vf, ar> b = xs.a(ar::a, ar::b);
   private final vu c;
   private final vu d;
   private final cqk e;
   private final Optional<ajh> f;
   private final al g;
   private final boolean h;
   private final boolean i;
   private final boolean j;
   private float k;
   private float l;

   public ar(cqk $$0, vu $$1, vu $$2, Optional<ajh> $$3, al $$4, boolean $$5, boolean $$6, boolean $$7) {
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

   public vu a() {
      return this.c;
   }

   public vu b() {
      return this.d;
   }

   public cqk c() {
      return this.e;
   }

   public Optional<ajh> d() {
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

   private void a(vf $$0) {
      vw.b.encode($$0, this.c);
      vw.b.encode($$0, this.d);
      cqk.f.encode($$0, this.e);
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

   private static ar b(vf $$0) {
      vu $$1 = vw.b.decode($$0);
      vu $$2 = vw.b.decode($$0);
      cqk $$3 = cqk.f.decode($$0);
      al $$4 = $$0.b(al.class);
      int $$5 = $$0.readInt();
      Optional<ajh> $$6 = ($$5 & 1) != 0 ? Optional.of($$0.q()) : Optional.empty();
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      ar $$9 = new ar($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }
}
