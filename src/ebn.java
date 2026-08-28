import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebn(jr<ebm> e, dzn f) {
   public static final Codec<ebn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ebm.l.fieldOf("type").forGetter(ebn::a), dzn.a.fieldOf("generator").forGetter(ebn::b)).apply($$0, $$0.stable(ebn::new))
   );
   public static final akt<ebn> b = akt.a(mc.bh, aku.b("overworld"));
   public static final akt<ebn> c = akt.a(mc.bh, aku.b("the_nether"));
   public static final akt<ebn> d = akt.a(mc.bh, aku.b("the_end"));

   public jr<ebm> a() {
      return this.e;
   }

   public dzn b() {
      return this.f;
   }
}
