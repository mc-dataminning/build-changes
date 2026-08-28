import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class ffx {
   public boolean a(@Nullable ffx $$0) {
      return $$0 == null ? false : this == $$0;
   }

   public abstract String c();

   public abstract xm d(wy var1);

   public abstract boolean j();

   public abstract boolean i();

   public abstract ffx.b k();

   public abstract n o();

   public abstract Collection<String> h();

   public abstract ffx.b l();

   public abstract ffx.a m();

   public static enum a implements bak {
      a("always", 0),
      b("never", 1),
      c("pushOtherTeams", 2),
      d("pushOwnTeam", 3);

      public static final Codec<ffx.a> e = bak.a(ffx.a::values);
      private static final IntFunction<ffx.a> i = ayc.a($$0 -> $$0.h, values(), ayc.a.a);
      public static final yw<ByteBuf, ffx.a> f = yu.a(i, $$0 -> $$0.h);
      public final String g;
      public final int h;

      private a(final String $$0, final int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public wy a() {
         return wy.c("team.collision." + this.g);
      }

      @Override
      public String c() {
         return this.g;
      }
   }

   public static enum b implements bak {
      a("always", 0),
      b("never", 1),
      c("hideForOtherTeams", 2),
      d("hideForOwnTeam", 3);

      public static final Codec<ffx.b> e = bak.a(ffx.b::values);
      private static final IntFunction<ffx.b> i = ayc.a($$0 -> $$0.h, values(), ayc.a.a);
      public static final yw<ByteBuf, ffx.b> f = yu.a(i, $$0 -> $$0.h);
      public final String g;
      public final int h;

      private b(final String $$0, final int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public wy a() {
         return wy.c("team.visibility." + this.g);
      }

      @Override
      public String c() {
         return this.g;
      }
   }
}
