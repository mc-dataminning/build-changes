import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class ck extends de<ck.a> {
   @Override
   public Codec<ck.a> a() {
      return ck.a.a;
   }

   public void a(aqi $$0, in $$1, csz $$2) {
      aqh $$3 = $$0.z();
      dqh $$4 = $$3.a_($$1);
      eoo $$5 = new eoo.a($$3).a(erc.f, $$1.b()).a(erc.a, $$0).a(erc.g, $$4).a(erc.i, $$2).a(erb.n);
      eol $$6 = new eol.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements de.a {
      public static final Codec<ck.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(br.b, "player").forGetter(ck.a::a), axh.a(bc.a, "location").forGetter(ck.a::b)).apply($$0, ck.a::new)
      );

      public static an<ck.a> a(dde $$0) {
         bc $$1 = bc.a(erp.a($$0).build());
         return am.z.a(new ck.a(Optional.empty(), Optional.of($$1)));
      }

      public static an<ck.a> a(erq.a... $$0) {
         bc $$1 = bc.a(Arrays.stream($$0).map(erq.a::build).toArray(erq[]::new));
         return am.z.a(new ck.a(Optional.empty(), Optional.of($$1)));
      }

      private static ck.a c(cr.a $$0, ch.a $$1) {
         bc $$2 = bc.a(ero.a($$0).build(), erx.a($$1).build());
         return new ck.a(Optional.empty(), Optional.of($$2));
      }

      public static an<ck.a> a(cr.a $$0, ch.a $$1) {
         return am.N.a(c($$0, $$1));
      }

      public static an<ck.a> b(cr.a $$0, ch.a $$1) {
         return am.aa.a(c($$0, $$1));
      }

      public boolean a(eol $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         de.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, erb.n, ".location"));
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<bc> b() {
         return this.c;
      }
   }
}
