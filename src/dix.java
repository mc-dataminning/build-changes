import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dix(diw e, xg f) {
   public static final Codec<dix> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(diw.b.forGetter(dix::a), xi.a.fieldOf("description").forGetter(dix::b)).apply($$0, dix::new)
   );
   public static final ze<wp, dix> b = ze.a(diw.c, dix::a, xi.b, dix::b, dix::new);
   public static final Codec<jg<dix>> c = aln.a(mi.bk, a);
   public static final ze<wp, jg<dix>> d = zc.a(mi.bk, b);

   public diw a() {
      return this.e;
   }

   public xg b() {
      return this.f;
   }
}
