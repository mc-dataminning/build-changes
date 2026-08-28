import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class as {
   public static final Codec<as> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cvl.d.fieldOf("icon").forGetter(as::c),
               xf.a.fieldOf("title").forGetter(as::a),
               xf.a.fieldOf("description").forGetter(as::b),
               alb.a.optionalFieldOf("background").forGetter(as::d),
               am.d.optionalFieldOf("frame", am.a).forGetter(as::e),
               Codec.BOOL.optionalFieldOf("show_toast", true).forGetter(as::h),
               Codec.BOOL.optionalFieldOf("announce_to_chat", true).forGetter(as::i),
               Codec.BOOL.optionalFieldOf("hidden", false).forGetter(as::j)
            )
            .apply($$0, as::new)
   );
   public static final zb<wo, as> b = zb.a(as::a, as::b);
   private final xd c;
   private final xd d;
   private final cvl e;
   private final Optional<alb> f;
   private final am g;
   private final boolean h;
   private final boolean i;
   private final boolean j;
   private float k;
   private float l;

   public as(cvl $$0, xd $$1, xd $$2, Optional<alb> $$3, am $$4, boolean $$5, boolean $$6, boolean $$7) {
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

   public xd a() {
      return this.c;
   }

   public xd b() {
      return this.d;
   }

   public cvl c() {
      return this.e;
   }

   public Optional<alb> d() {
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

   private void a(wo $$0) {
      xf.d.encode($$0, this.c);
      xf.d.encode($$0, this.d);
      cvl.i.encode($$0, this.e);
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

      $$0.q($$1);
      this.f.ifPresent($$0::a);
      $$0.a(this.k);
      $$0.a(this.l);
   }

   private static as b(wo $$0) {
      xd $$1 = xf.d.decode($$0);
      xd $$2 = xf.d.decode($$0);
      cvl $$3 = cvl.i.decode($$0);
      am $$4 = $$0.b(am.class);
      int $$5 = $$0.readInt();
      Optional<alb> $$6 = ($$5 & 1) != 0 ? Optional.of($$0.q()) : Optional.empty();
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      as $$9 = new as($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }
}
