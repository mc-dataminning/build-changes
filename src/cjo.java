import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjo(iw e, cue f) implements cua<cud, cub> {
   public static final Codec<cjo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.b.forGetter(cjo::b), cue.b.fieldOf("spawn_conditions").forGetter(cjo::c)).apply($$0, cjo::new)
   );
   public static final Codec<cjo> b = RecordCodecBuilder.create($$0 -> $$0.group(iw.b.forGetter(cjo::b)).apply($$0, cjo::new));
   public static final Codec<jf<cjo>> c = alf.a(mh.aH);
   public static final yy<wl, jf<cjo>> d = yw.b(mh.aH);

   private cjo(iw $$0) {
      this($$0, cue.a);
   }

   @Override
   public List<cua.a<cud, cub>> a() {
      return this.f.a();
   }

   public iw b() {
      return this.e;
   }

   public cue c() {
      return this.f;
   }
}
