import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fjq extends fjp {
   static fjq.a a(GameProfile $$0, uc $$1, fjo $$2) {
      return new fjq.a($$0, $$1, $$2);
   }

   static fjq.b a(tn $$0, Instant $$1) {
      return new fjq.b($$0, $$1);
   }

   tn b();

   default tn c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, uc d, fjo e) implements fjq {
      public static final Codec<fjq.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  arh.u.fieldOf("profile").forGetter(fjq.a::f), uc.a.forGetter(fjq.a::g), fjo.d.optionalFieldOf("trust_level", fjo.a).forGetter(fjq.a::h)
               )
               .apply($$0, fjq.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public tn b() {
         if (!this.d.n().a()) {
            tn $$0 = this.d.n().b(this.d.b());
            return (tn)($$0 != null ? $$0 : tn.h());
         } else {
            return this.d.c();
         }
      }

      @Override
      public tn c() {
         tn $$0 = this.b();
         tn $$1 = this.i();
         return tn.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public tn d() {
         tn $$0 = this.i();
         return tn.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private tn i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.d(), ZoneOffset.systemDefault());
         return tn.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fjp.a a() {
         return fjp.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public uc g() {
         return this.d;
      }

      public fjo h() {
         return this.e;
      }
   }

   public static record b(tn c, Instant d) implements fjq {
      public static final Codec<fjq.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(arh.b.fieldOf("message").forGetter(fjq.b::d), arh.m.fieldOf("time_stamp").forGetter(fjq.b::e)).apply($$0, fjq.b::new)
      );

      @Override
      public tn b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fjp.a a() {
         return fjp.a.b;
      }

      public tn d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
