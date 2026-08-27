import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epg extends eoo {
   public static final Codec<epg> a = RecordCodecBuilder.create($$0 -> a($$0).and(kr.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, epg::new));
   private final il<ctf> b;

   private epg(List<eqc> $$0, il<ctf> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eoq b() {
      return eor.A;
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      $$0.a(jp.x, cth.a, this.b, cth::b);
      return $$0;
   }

   public static eoo.a<?> a(il<ctf> $$0) {
      return a($$1 -> new epg($$1, $$0));
   }
}
