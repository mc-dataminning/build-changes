import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class as {
   public static final Codec<as> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cuh.a.fieldOf("icon").forGetter(as::c),
               xg.a.fieldOf("title").forGetter(as::a),
               xg.a.fieldOf("description").forGetter(as::b),
               axu.a(akt.a, "background").forGetter(as::d),
               axu.a(am.d, "frame", am.a).forGetter(as::e),
               axu.a(Codec.BOOL, "show_toast", true).forGetter(as::h),
               axu.a(Codec.BOOL, "announce_to_chat", true).forGetter(as::i),
               axu.a(Codec.BOOL, "hidden", false).forGetter(as::j)
            )
            .apply($$0, as::new)
   );
   public static final zc<wp, as> b = zc.a(as::a, as::b);
   private final xe c;
   private final xe d;
   private final cuh e;
   private final Optional<akt> f;
   private final am g;
   private final boolean h;
   private final boolean i;
   private final boolean j;
   private float k;
   private float l;

   public as(cuh $$0, xe $$1, xe $$2, Optional<akt> $$3, am $$4, boolean $$5, boolean $$6, boolean $$7) {
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

   public xe a() {
      return this.c;
   }

   public xe b() {
      return this.d;
   }

   public cuh c() {
      return this.e;
   }

   public Optional<akt> d() {
      return this.f;
   }

   public am e() {
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

   private void a(wp $$0) {
      xg.d.encode($$0, this.c);
      xg.d.encode($$0, this.d);
      cuh.f.encode($$0, this.e);
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

   private static as b(wp $$0) {
      xe $$1 = xg.d.decode($$0);
      xe $$2 = xg.d.decode($$0);
      cuh $$3 = cuh.f.decode($$0);
      am $$4 = $$0.b(am.class);
      int $$5 = $$0.readInt();
      Optional<akt> $$6 = ($$5 & 1) != 0 ? Optional.of($$0.q()) : Optional.empty();
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      as $$9 = new as($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }
}
