import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ar {
   public static final Codec<ar> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               csd.a.fieldOf("icon").forGetter(ar::c),
               wu.a.fieldOf("title").forGetter(ar::a),
               wu.a.fieldOf("description").forGetter(ar::b),
               axe.a(akf.a, "background").forGetter(ar::d),
               axe.a(al.d, "frame", al.a).forGetter(ar::e),
               axe.a(Codec.BOOL, "show_toast", true).forGetter(ar::h),
               axe.a(Codec.BOOL, "announce_to_chat", true).forGetter(ar::i),
               axe.a(Codec.BOOL, "hidden", false).forGetter(ar::j)
            )
            .apply($$0, ar::new)
   );
   public static final yq<wd, ar> b = yq.a(ar::a, ar::b);
   private final ws c;
   private final ws d;
   private final csd e;
   private final Optional<akf> f;
   private final al g;
   private final boolean h;
   private final boolean i;
   private final boolean j;
   private float k;
   private float l;

   public ar(csd $$0, ws $$1, ws $$2, Optional<akf> $$3, al $$4, boolean $$5, boolean $$6, boolean $$7) {
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

   public ws a() {
      return this.c;
   }

   public ws b() {
      return this.d;
   }

   public csd c() {
      return this.e;
   }

   public Optional<akf> d() {
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

   private void a(wd $$0) {
      wu.d.encode($$0, this.c);
      wu.d.encode($$0, this.d);
      csd.f.encode($$0, this.e);
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

   private static ar b(wd $$0) {
      ws $$1 = wu.d.decode($$0);
      ws $$2 = wu.d.decode($$0);
      csd $$3 = csd.f.decode($$0);
      al $$4 = $$0.b(al.class);
      int $$5 = $$0.readInt();
      Optional<akf> $$6 = ($$5 & 1) != 0 ? Optional.of($$0.q()) : Optional.empty();
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      ar $$9 = new ar($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }
}
