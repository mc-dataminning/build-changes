import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fsx extends fsw {
   static fsx.a a(GameProfile $$0, wk $$1, fsv $$2) {
      return new fsx.a($$0, $$1, $$2);
   }

   static fsx.b a(vu $$0, Instant $$1) {
      return new fsx.b($$0, $$1);
   }

   vu b();

   default vu c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, wk d, fsv e) implements fsx {
      public static final Codec<fsx.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awe.v.fieldOf("profile").forGetter(fsx.a::f), wk.a.forGetter(fsx.a::g), fsv.d.optionalFieldOf("trust_level", fsv.a).forGetter(fsx.a::h)
               )
               .apply($$0, fsx.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public vu b() {
         if (!this.d.o().a()) {
            vu $$0 = this.d.o().b(this.d.c());
            return (vu)($$0 != null ? $$0 : vu.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public vu c() {
         vu $$0 = this.b();
         vu $$1 = this.i();
         return vu.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public vu d() {
         vu $$0 = this.i();
         return vu.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private vu i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return vu.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fsw.a a() {
         return fsw.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public wk g() {
         return this.d;
      }

      public fsv h() {
         return this.e;
      }
   }

   public static record b(vu c, Instant d) implements fsx {
      public static final Codec<fsx.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(vw.a.fieldOf("message").forGetter(fsx.b::d), awe.n.fieldOf("time_stamp").forGetter(fsx.b::e)).apply($$0, fsx.b::new)
      );

      @Override
      public vu b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fsw.a a() {
         return fsw.a.b;
      }

      public vu d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
