import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fjo extends fjn {
   static fjo.a a(GameProfile $$0, ub $$1, fjm $$2) {
      return new fjo.a($$0, $$1, $$2);
   }

   static fjo.b a(tm $$0, Instant $$1) {
      return new fjo.b($$0, $$1);
   }

   tm b();

   default tm c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, ub d, fjm e) implements fjo {
      public static final Codec<fjo.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  arg.u.fieldOf("profile").forGetter(fjo.a::f), ub.a.forGetter(fjo.a::g), fjm.d.optionalFieldOf("trust_level", fjm.a).forGetter(fjo.a::h)
               )
               .apply($$0, fjo.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public tm b() {
         if (!this.d.n().a()) {
            tm $$0 = this.d.n().b(this.d.b());
            return (tm)($$0 != null ? $$0 : tm.h());
         } else {
            return this.d.c();
         }
      }

      @Override
      public tm c() {
         tm $$0 = this.b();
         tm $$1 = this.i();
         return tm.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public tm d() {
         tm $$0 = this.i();
         return tm.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private tm i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.d(), ZoneOffset.systemDefault());
         return tm.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fjn.a a() {
         return fjn.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public ub g() {
         return this.d;
      }

      public fjm h() {
         return this.e;
      }
   }

   public static record b(tm c, Instant d) implements fjo {
      public static final Codec<fjo.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(arg.b.fieldOf("message").forGetter(fjo.b::d), arg.m.fieldOf("time_stamp").forGetter(fjo.b::e)).apply($$0, fjo.b::new)
      );

      @Override
      public tm b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fjn.a a() {
         return fjn.a.b;
      }

      public tm d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
