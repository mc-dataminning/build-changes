import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cvy(jo<awf> e, xe f, float g, int h) {
   public static final Codec<cvy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awf.b.fieldOf("sound_event").forGetter(cvy::b),
               xg.a.fieldOf("description").forGetter(cvy::c),
               ayo.n.fieldOf("length_in_seconds").forGetter(cvy::d),
               ayo.a(0, 15).fieldOf("comparator_output").forGetter(cvy::e)
            )
            .apply($$0, cvy::new)
   );
   public static final zc<wp, cvy> b = zc.a(awf.d, cvy::b, xg.b, cvy::c, za.j, cvy::d, za.h, cvy::e, cvy::new);
   public static final Codec<jo<cvy>> c = alb.a(lw.L);
   public static final zc<wp, jo<cvy>> d = za.a(lw.L, b);
   private static final int i = 20;

   public int a() {
      return azf.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jo<cvy>> a(jq.a $$0, cvs $$1) {
      cvx $$2 = $$1.a(ks.W);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public jo<awf> b() {
      return this.e;
   }

   public xe c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
