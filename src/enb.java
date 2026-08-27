import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class enb {
   private final enh a;
   private final axr b;
   private final enf c;
   private final Set<enb.c<?>> d = Sets.newLinkedHashSet();

   enb(enh $$0, axr $$1, enf $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(epl<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(epl<T> $$0) {
      return this.a.b($$0);
   }

   public void a(ajt $$0, Consumer<crj> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(epl<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(enb.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(enb.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(enb.c<?> $$0) {
      this.d.remove($$0);
   }

   public enf a() {
      return this.c;
   }

   public axr b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public aps d() {
      return this.a.a();
   }

   public static enb.c<enj> a(enj $$0) {
      return new enb.c<>(eng.c, $$0);
   }

   public static enb.c<eqc> a(eqc $$0) {
      return new enb.c<>(eng.a, $$0);
   }

   public static enb.c<eop> a(eop $$0) {
      return new enb.c<>(eng.b, $$0);
   }

   public static class a {
      private final enh a;
      @Nullable
      private axr b;

      public a(enh $$0) {
         this.a = $$0;
      }

      public enb.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = axr.a($$0);
         }

         return this;
      }

      public aps a() {
         return this.a.a();
      }

      public enb a(Optional<ajt> $$0) {
         aps $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         axr $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new enb(this.a, $$3, $$2.aM());
      }
   }

   public static enum b implements aye {
      a("this", epo.a),
      b("killer", epo.d),
      c("direct_killer", epo.e),
      d("killer_player", epo.b);

      public static final aye.a<enb.b> e = aye.a(enb.b::values);
      private final String f;
      private final epl<? extends bpv> g;

      private b(String $$0, epl<? extends bpv> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public epl<? extends bpv> a() {
         return this.g;
      }

      public static enb.b a(String $$0) {
         enb.b $$1 = e.a($$0);
         if ($$1 != null) {
            return $$1;
         } else {
            throw new IllegalArgumentException("Invalid entity target " + $$0);
         }
      }

      @Override
      public String c() {
         return this.f;
      }
   }

   public static record c<T>(eng<T> a, T b) {
   }
}
