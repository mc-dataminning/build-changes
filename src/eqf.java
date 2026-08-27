import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eqf extends epo {
   public static final Codec<eqf> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(esd.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eqf::new)
   );
   private final esc b;
   private final boolean c;

   private eqf(List<erh> $$0, esc $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public epq b() {
      return epr.c;
   }

   @Override
   public Set<eqq<?>> a() {
      return this.b.a();
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      int $$2 = this.c ? $$0.G() : 0;
      $$0.e(axw.a($$2 + this.b.a($$1), 0, $$0.i()));
      return $$0;
   }

   public static epo.a<?> a(esc $$0) {
      return a($$1 -> new eqf($$1, $$0, false));
   }

   public static epo.a<?> a(esc $$0, boolean $$1) {
      return a($$2 -> new eqf($$2, $$0, $$1));
   }
}
