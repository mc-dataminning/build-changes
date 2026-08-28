import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class cm extends dj<cm.a> {
   @Override
   public Codec<cm.a> a() {
      return cm.a.a;
   }

   public void a(arr $$0, iu $$1, cyy $$2) {
      arq $$3 = $$0.y();
      dzz $$4 = $$3.a_($$1);
      ezc $$5 = new ezc.a($$3).a(fbt.f, $$1.b()).a(fbt.a, $$0).a(fbt.g, $$4).a(fbt.i, $$2).a(fbs.o);
      eyz $$6 = new eyz.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bi> b, Optional<bi> c) implements dj.a {
      public static final Codec<cm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(cm.a::a), bi.a.optionalFieldOf("location").forGetter(cm.a::b)).apply($$0, cm.a::new)
      );

      public static aq<cm.a> a(dma $$0) {
         bi $$1 = bi.a(fch.a($$0).build());
         return ap.z.a(new cm.a(Optional.empty(), Optional.of($$1)));
      }

      public static aq<cm.a> a(fci.a... $$0) {
         bi $$1 = bi.a(Arrays.stream($$0).map(fci.a::build).toArray(fci[]::new));
         return ap.z.a(new cm.a(Optional.empty(), Optional.of($$1)));
      }

      private static cm.a c(ct.a $$0, cl.a $$1) {
         bi $$2 = bi.a(fcg.a($$0).build(), fcp.a($$1).build());
         return new cm.a(Optional.empty(), Optional.of($$2));
      }

      public static aq<cm.a> a(ct.a $$0, cl.a $$1) {
         return ap.N.a(c($$0, $$1));
      }

      public static aq<cm.a> b(ct.a $$0, cl.a $$1) {
         return ap.aa.a(c($$0, $$1));
      }

      public boolean a(eyz $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bj $$0) {
         dj.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, fbs.o, ".location"));
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<bi> b() {
         return this.c;
      }
   }
}
