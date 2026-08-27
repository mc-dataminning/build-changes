import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ar {
   public static final Codec<ar> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               crj.a.fieldOf("icon").forGetter(ar::c),
               wi.a.fieldOf("title").forGetter(ar::a),
               wi.a.fieldOf("description").forGetter(ar::b),
               aws.a(ajt.a, "background").forGetter(ar::d),
               aws.a(al.d, "frame", al.a).forGetter(ar::e),
               aws.a(Codec.BOOL, "show_toast", true).forGetter(ar::h),
               aws.a(Codec.BOOL, "announce_to_chat", true).forGetter(ar::i),
               aws.a(Codec.BOOL, "hidden", false).forGetter(ar::j)
            )
            .apply($$0, ar::new)
   );
   public static final ye<vr, ar> b = ye.a(ar::a, ar::b);
   private final wg c;
   private final wg d;
   private final crj e;
   private final Optional<ajt> f;
   private final al g;
   private final boolean h;
   private final boolean i;
   private final boolean j;
   private float k;
   private float l;

   public ar(crj $$0, wg $$1, wg $$2, Optional<ajt> $$3, al $$4, boolean $$5, boolean $$6, boolean $$7) {
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

   public wg a() {
      return this.c;
   }

   public wg b() {
      return this.d;
   }

   public crj c() {
      return this.e;
   }

   public Optional<ajt> d() {
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

   private void a(vr $$0) {
      wi.d.encode($$0, this.c);
      wi.d.encode($$0, this.d);
      crj.f.encode($$0, this.e);
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

   private static ar b(vr $$0) {
      wg $$1 = wi.d.decode($$0);
      wg $$2 = wi.d.decode($$0);
      crj $$3 = crj.f.decode($$0);
      al $$4 = $$0.b(al.class);
      int $$5 = $$0.readInt();
      Optional<ajt> $$6 = ($$5 & 1) != 0 ? Optional.of($$0.q()) : Optional.empty();
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      ar $$9 = new ar($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }
}
