import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fiz extends fiy {
   static fiz.a a(GameProfile $$0, tu $$1, fix $$2) {
      return new fiz.a($$0, $$1, $$2);
   }

   static fiz.b a(tf $$0, Instant $$1) {
      return new fiz.b($$0, $$1);
   }

   tf b();

   default tf c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, tu d, fix e) implements fiz {
      public static final Codec<fiz.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aqy.t.fieldOf("profile").forGetter(fiz.a::f), tu.a.forGetter(fiz.a::g), fix.d.optionalFieldOf("trust_level", fix.a).forGetter(fiz.a::h)
               )
               .apply($$0, fiz.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public tf b() {
         if (!this.d.n().a()) {
            tf $$0 = this.d.n().b(this.d.b());
            return (tf)($$0 != null ? $$0 : tf.h());
         } else {
            return this.d.c();
         }
      }

      @Override
      public tf c() {
         tf $$0 = this.b();
         tf $$1 = this.i();
         return tf.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public tf d() {
         tf $$0 = this.i();
         return tf.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private tf i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.d(), ZoneOffset.systemDefault());
         return tf.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fiy.a a() {
         return fiy.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public tu g() {
         return this.d;
      }

      public fix h() {
         return this.e;
      }
   }

   public static record b(tf c, Instant d) implements fiz {
      public static final Codec<fiz.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(aqy.b.fieldOf("message").forGetter(fiz.b::d), aqy.m.fieldOf("time_stamp").forGetter(fiz.b::e)).apply($$0, fiz.b::new)
      );

      @Override
      public tf b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fiy.a a() {
         return fiy.a.b;
      }

      public tf d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
