import com.google.common.collect.Lists;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class fbb extends fbv implements fbp {
   @SerializedName("pingResults")
   public List<fbq> a = Lists.newArrayList();
   @SerializedName("worldIds")
   public List<Long> b = Lists.newArrayList();
}
