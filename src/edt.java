import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edt extends eec {
   public static final Codec<edt> a = RecordCodecBuilder.create($$0 -> a($$0).and(edt.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, edt::new));
   private final edt.a b;

   private edt(List<efp> $$0, edt.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eee b() {
      return eef.o;
   }

   @Override
   public Set<eey<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      if ($$1.c(this.b.g) instanceof bhc $$3 && $$3.ad()) {
         $$0.a($$3.N_());
      }

      return $$0;
   }

   public static eec.a<?> a(edt.a $$0) {
      return a($$1 -> new edt($$1, $$0));
   }

   public static enum a implements asp {
      a("this", efb.a),
      b("killer", efb.d),
      c("killer_player", efb.b),
      d("block_entity", efb.h);

      public static final Codec<edt.a> e = asp.a(edt.a::values);
      private final String f;
      final eey<?> g;

      private a(String $$0, eey<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
