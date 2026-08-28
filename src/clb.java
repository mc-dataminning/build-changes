import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record clb(iw e, ctq f) implements ctm<ctp, ctn> {
   public static final Codec<clb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.b.forGetter(clb::b), ctq.b.fieldOf("spawn_conditions").forGetter(clb::c)).apply($$0, clb::new)
   );
   public static final Codec<clb> b = RecordCodecBuilder.create($$0 -> $$0.group(iw.b.forGetter(clb::b)).apply($$0, clb::new));
   public static final Codec<jf<clb>> c = ald.a(mh.aT);
   public static final yw<wj, jf<clb>> d = yu.b(mh.aT);

   private clb(iw $$0) {
      this($$0, ctq.a);
   }

   @Override
   public List<ctm.a<ctp, ctn>> a() {
      return this.f.a();
   }

   public iw b() {
      return this.e;
   }

   public ctq c() {
      return this.f;
   }
}
