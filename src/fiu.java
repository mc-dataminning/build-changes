import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fiu extends fit {
   static fiu.a a(GameProfile $$0, tt $$1, fis $$2) {
      return new fiu.a($$0, $$1, $$2);
   }

   static fiu.b a(te $$0, Instant $$1) {
      return new fiu.b($$0, $$1);
   }

   te b();

   default te c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, tt d, fis e) implements fiu {
      public static final Codec<fiu.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aqw.t.fieldOf("profile").forGetter(fiu.a::f), tt.a.forGetter(fiu.a::g), fis.d.optionalFieldOf("trust_level", fis.a).forGetter(fiu.a::h)
               )
               .apply($$0, fiu.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public te b() {
         if (!this.d.n().a()) {
            te $$0 = this.d.n().b(this.d.b());
            return (te)($$0 != null ? $$0 : te.h());
         } else {
            return this.d.c();
         }
      }

      @Override
      public te c() {
         te $$0 = this.b();
         te $$1 = this.i();
         return te.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public te d() {
         te $$0 = this.i();
         return te.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private te i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.d(), ZoneOffset.systemDefault());
         return te.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fit.a a() {
         return fit.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public tt g() {
         return this.d;
      }

      public fis h() {
         return this.e;
      }
   }

   public static record b(te c, Instant d) implements fiu {
      public static final Codec<fiu.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(aqw.b.fieldOf("message").forGetter(fiu.b::d), aqw.m.fieldOf("time_stamp").forGetter(fiu.b::e)).apply($$0, fiu.b::new)
      );

      @Override
      public te b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fit.a a() {
         return fit.a.b;
      }

      public te d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
