import java.net.SocketAddress;
import jdk.jfr.Category;
import jdk.jfr.DataAmount;
import jdk.jfr.Enabled;
import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.StackTrace;

@Category({"Minecraft", "Network"})
@StackTrace(false)
@Enabled(false)
public abstract class bgd extends Event {
   @Name("protocolId")
   @Label("Protocol Id")
   public final String protocolId;
   @Name("packetId")
   @Label("Packet Id")
   public final int packetId;
   @Name("remoteAddress")
   @Label("Remote Address")
   public final String remoteAddress;
   @Name("bytes")
   @Label("Bytes")
   @DataAmount
   public final int bytes;

   public bgd(String $$0, int $$1, SocketAddress $$2, int $$3) {
      this.protocolId = $$0;
      this.packetId = $$1;
      this.remoteAddress = $$2.toString();
      this.bytes = $$3;
   }

   public static final class a {
      public static final String a = "remoteAddress";
      public static final String b = "protocolId";
      public static final String c = "packetId";
      public static final String d = "bytes";

      private a() {
      }
   }
}
