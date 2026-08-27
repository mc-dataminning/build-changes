import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ekw {
   private final elc a;
   private final axd b;
   private final ela c;
   private final Set<ekw.c<?>> d = Sets.newLinkedHashSet();

   ekw(elc $$0, axd $$1, ela $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(ene<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(ene<T> $$0) {
      return this.a.b($$0);
   }

   public void a(ajh $$0, Consumer<cqm> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(ene<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(ekw.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(ekw.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(ekw.c<?> $$0) {
      this.d.remove($$0);
   }

   public ela a() {
      return this.c;
   }

   public axd b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public apf d() {
      return this.a.a();
   }

   public static ekw.c<ele> a(ele $$0) {
      return new ekw.c<>(elb.c, $$0);
   }

   public static ekw.c<env> a(env $$0) {
      return new ekw.c<>(elb.a, $$0);
   }

   public static ekw.c<emj> a(emj $$0) {
      return new ekw.c<>(elb.b, $$0);
   }

   public static class a {
      private final elc a;
      @Nullable
      private axd b;

      public a(elc $$0) {
         this.a = $$0;
      }

      public ekw.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = axd.a($$0);
         }

         return this;
      }

      public apf a() {
         return this.a.a();
      }

      public ekw a(Optional<ajh> $$0) {
         apf $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         axd $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new ekw(this.a, $$3, $$2.aM());
      }
   }

   public static enum b implements axq {
      a("this", enh.a),
      b("killer", enh.d),
      c("direct_killer", enh.e),
      d("killer_player", enh.b);

      public static final axq.a<ekw.b> e = axq.a(ekw.b::values);
      private final String f;
      private final ene<? extends box> g;

      private b(String $$0, ene<? extends box> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public ene<? extends box> a() {
         return this.g;
      }

      public static ekw.b a(String $$0) {
         ekw.b $$1 = e.a($$0);
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

   public static record c<T>(elb<T> a, T b) {
   }
}
